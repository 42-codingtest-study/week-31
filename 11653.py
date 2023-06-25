# 12강 _ 소인수분해

n = int(input())
list = []

for i in range(2, n + 1):
    for j in range(2, int(i ** 0.5) + 1) :
        if i % j == 0 :
            break
    else :
        list.append(i)

while n != 1 :
    for i in list :
        if n % i == 0 :
            n = n / i
            print(i)
            break