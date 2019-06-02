import os


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

    if(cnt >= occurence):
         print (cnt)

if __name__ == "__main__":
   
    t = int(input())

    for t_itr in range(t):
        q = list(map(int, input().rstrip().split()))
        coolNum(q[0],q[1])