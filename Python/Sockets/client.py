import socket
import sys
import os
from functions import send_file, recv_file, recv_listing


try:
    s = os.path.dirname(__file__)
    rp = "client_save/"
    fp = os.path.join(s, rp)

    cli_soc = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    srv_add = (sys.argv[1], int(sys.argv[2]))
    cli_soc.connect(srv_add)
        
    print("Connected")

    if(len(sys.argv)==4):
        c_input = sys.argv[3]+" "
    elif(len(sys.argv)==5):
        c_input = sys.argv[3]+" "+sys.argv[4]

    command = c_input.split(" ", 1)

    if (command[0] == "list"):
        cli_soc.sendall(str.encode(c_input))
        li=recv_listing(cli_soc)
        print(" ".join(li))

    else:
        file= fp+command[1]
        if (command[0] == "put"):
            cli_soc.sendall(str.encode(c_input))
            send_file(file,cli_soc)
        elif (command[0] == "get"):
            cli_soc.sendall(str.encode(c_input))
            recv_file(file,cli_soc)
        

except Exception as x:
    print(x)
finally:
    cli_soc.close()