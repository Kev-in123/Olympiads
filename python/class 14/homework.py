import time
def fib(num):
  n1=0
  n2=1
  for i in range(num):
    n1 += n2
    n2 = n1 - n2
  return n1

n=40
t1=time.time()
for i in range(10000):
  a=fib(n)
t2=time.time()
print("fib3(%d)=%d:%fs"%(n,a,t2-t1))