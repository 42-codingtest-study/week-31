def fac(n):
    res = 1
    while(n>0):
        res *= n
        n -= 1
    return(res)
n = int(input())
ans = fac(n)
arr = list(str(ans))
count = 0
for i in range(1,len(arr)+1):
    if arr[-i] == '0':
        count+=1
    else:
        print(count)
        break

    