
def coolNum(dec,occurence):
    binaryNum = bin(dec)
    result = ""
    cnt=0
    for i,k in enumerate(binaryNum):
        if (i>1):
            result+=str(k)
        if result.__contains__("101"):
                result=str(1)
                cnt +=1

    print(cnt)
    if(cnt >= occurence):
        print("Cool Number")

if __name__ == "__main__":
    coolNum(22,2)