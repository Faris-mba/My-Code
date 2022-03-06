import socket
import sys
import os
from functions import send_file, recv_file, send_listing, recv_listing

s = os.path.dirname(__file__)
rp = "server_save/"
fp = os.path.join(s, rp)

ser_soc = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
try:
   ser_soc.bind(("0.0.0.0", int(sys.argv[1])))
   ser_soc.listen(5)

except Exception as x:
   print(x)
   exit(1)

while True:
    try:
        print("Searching for new connection... ")
        cli_soc, cli_add = ser_soc.accept()
        cli_add_str = str(cli_add)
        print("Client " + cli_add_str + " found connection. start the chat..")


        cList = cli_soc.recv(1024)
        command = cList.decode().split(" ", 1)
        
        if (command[0] == "list"):
            send_listing(cli_soc)
            
        else:
            textfile = command[1]
            file=fp+textfile
        
        if (command[0] == "put"):
            recv_file(file,cli_soc)
        elif (command[0] == "get"):
            send_file(file,cli_soc)

    finally:
        cli_soc.close()
    exit(0)
    