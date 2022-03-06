import socket
import os


#def function To send list from server to client
def send_listing(sock):

    s = os.path.dirname(__file__)
    rp = "server_save/"  #folder name that data saved in
    fp = os.path.join(s, rp)
    dir = os.listdir(fp)
    for file in dir:
        sock.sendall(str.encode(file))
    print ("The list has been sent to the Client")
    sock.close()
    return
  


  # def function that to recevie list from server 
def recv_listing(sock):

    li=[]
    while True:

        data = sock.recv(1024)
        li.append(data.decode())
        if not data:
            break
        print ("The list has been received from the Server")
        sock.close()
        return li
         
  
  
#send file from client to the server
def send_file(fil,sock):

    s = os.path.dirname(__file__)
  
    if("client_save/" in fil):
        find = fil.replace("client_save/","")
        fp = os.path.join(s, "server_save/")
        dir = os.listdir(fp)
    elif("server_save/" in fil):
        find = fil.replace("server_save/","")
        fp = os.path.join(s, "client_save/")
        dir = os.listdir(fp)
  

    exist=False
    
    print("file name "+find)
    
    for fil in dir:
        if (find == fil):
            exist=True
            break
        if(not exist):
            with open(fil, 'rb') as f:
                for data in f:
                    sock.sendall(data)
            print ("File sent")
        else:
            raise Exception("OverWriting existing file")
        sock.close()
        return



#client recive file from server
def recv_file(fil,sock):

    with open(fil, 'wb') as f:
        while True:
            data = sock.recv(1024)
            
            if not data:
                break
            
            f.write(data)
    f.close()
    print ("File received")
    sock.close()
    return