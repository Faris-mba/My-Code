#Importing tools

from flask import Flask, render_template, flash, request, redirect, url_for, request
from wtforms import Form, TextField, TextAreaField, validators, StringField, SubmitField

app=Flask(__name__)
app.config.from_object(__name__)
app.config['SECRET_KEY'] = '1117351872faris0539199004'     # security code for the page


# create a class including attributes that will be using multable time

class ReusableForm(Form):
    name = TextField('Name:', validators=[validators.DataRequired()])
    GICNumber = TextField('GICNumber:', validators=[validators.DataRequired()])
    email = TextField('email:', validators=[validators.DataRequired()])
    question1 = TextField('question1:', validators=[validators.DataRequired()])
    question2 = TextField('question2:', validators=[validators.DataRequired()])



# create function 

def write_to_disk(name, GICNumber, email, question1, question2):
    data = open('file.txt', 'a')
    data.write( 'Name={}, GICNumber={}, email={}, question1={}, question2={} \n'.format(name, GICNumber, email, question1, question2))
    data.close()
@app.route('/', methods=['GET', 'POST'])
def hello():
    form = ReusableForm(request.form)

    if request.method == 'POST':
        name=request.form['name']                                        
        GICNumber=request.form['GICNumber']
        email=request.form['email']
        question1=request.form['question1']
        question2=request.form['question2']

        if form.validate():
            write_to_disk(name, GICNumber, email, question1, question2)
            flash('Hello {} {}'.format(name, GICNumber))                  #If all the data is filled out, the phrase “Hello” appears with the name

        else:                                                       #  If not all data is filled phrase error shows
            flash('Error: All Fields Are Required')

    return render_template('index.html' ,form=form)

if __name__ == '__main__':      # if name = main the app will start 
    app.run(debug=True)

                                        

