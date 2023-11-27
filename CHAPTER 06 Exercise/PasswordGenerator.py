import string, random

print("Hello Ryhq")
print("-------------------------")
length = int(input("Enter the of the password you want\n"))
lower = string.ascii_lowercase
upper = string.ascii_uppercase
num = string.digits
symbols = string.punctuation
all = lower + upper + num + symbols
sample = random.sample(all, length)
password = "".join(sample)
print(password)