

def minimumBribes(q):
    count=0
    for pos , i in reversed(list(enumerate(q,1))):
        p = set(q[slice(max(0,pos-3),pos)])
        if pos not in p :
            return 'Too Chaotic'
        elif pos in p:
            if q[pos-3]-pos == 0:
                count+=2
                temp = q[pos-3]
                q[pos-3] = q[pos-2]
                q[pos-2] = temp
                temp =q[pos-2]
                q[pos-2] = q[pos-1]
                q[pos-1] = temp
            elif q[pos-1] != pos:
                count+=1
                temp =q[pos-2]
                q[pos-2] = q[pos-1]
                q[pos-1] = temp
        else:
            pass
    return count

if __name__== '__main__':
#Number of inputs
    t = int(input())

    for t_itr in range(t):
#Number of people in the queue
        n = int(input())
#The array representing the unordered queue
        q = list(map(int, input().rstrip().split()))

        print (minimumBribes(q))
