#Github Faris-mba

import tkinter            # importing tools

root = tkinter.Tk()
root.title("Measurement transducer")
root.geometry("450x300")

# Create function(s)
def calculate_mile():                       #function for convert Measurements
    mile = float(entry_mile.get())
    km = float(round(mile *1.60934 ))          # i used float for Numbers less than zero
    label_result1['text'] = f"km: {km}"         #label result for the result

def calculate_km():
    km = float(entry_km.get())
    mile = float(round(km *0.621371))
    label_result2['text'] = f"mile : {mile}"

def calculate_kg():
    kg = float(entry_kg.get())
    lbs = float(round(kg *2.2))
    label_result3['text'] = f"lbs : {lbs}"

def calculate_lbs():
    lbs = float(entry_lbs.get())
    kg = float(round(lbs *0.45))
    label_result4['text'] = f"kg : {kg}"
 
# Create GUI
label_mile = tkinter.Label(root, text="mile: ")         #create a label with entry
label_mile.grid(column=0, row=0)

label_km = tkinter.Label(root, text="km: ")
label_km.grid(column=0, row=1)

entry_mile = tkinter.Entry(root)
entry_mile.grid(column=1, row=0)

entry_km = tkinter.Entry(root)
entry_km.grid(column=1, row=1)


label_kg = tkinter.Label(root, text="kg: ")
label_kg.grid(column=0, row=6)

label_lbs = tkinter.Label(root, text="lbs: ")
label_lbs.grid(column=0, row=7)

entry_kg = tkinter.Entry(root)
entry_kg.grid(column=1, row=6)

entry_lbs = tkinter.Entry(root)
entry_lbs.grid(column=1, row=7)


#      create buttons for calculateing 


button_calculate = tkinter.Button(root, text="Convert mi to km", command=calculate_mile)
button_calculate.grid(column=0, row=2)

button_calculate = tkinter.Button(root, text="Convert km to mi", command=calculate_km)
button_calculate.grid(column=0, row=3)

button_calculate = tkinter.Button(root, text="Convert kg to lbs", command=calculate_kg)
button_calculate.grid(column=0, row=8)

button_calculate = tkinter.Button(root, text="Convert lbs to kg", command=calculate_lbs)
button_calculate.grid(column=0, row=9)


label_result1 = tkinter.Label(root, text="km: ")
label_result1.grid(column=1, row=2)

label_result2 = tkinter.Label(root, text="mile: ")
label_result2.grid(column=2, row=2)

label_result3 = tkinter.Label(root, text="lbs: ")
label_result3.grid(column=1, row=8)

label_result4 = tkinter.Label(root, text="kg: ")
label_result4.grid(column=2, row=8)



root.mainloop()


