import subprocess
import time
import sys
import os

if len(sys.argv)>1:
    subprocess.Popen(['javac',sys.argv[1]])
    time.sleep(1)
else:
    os.system('javac *.java')

#time.sleep(1)
filenames = os.listdir(os.curdir)

for i in filenames:
    if i.endswith('.class'):
        os.system('mv '+i+' ../Java-Class-Files')
