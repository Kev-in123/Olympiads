def fib(n):

    if n==1 or n==2:
        return 1
    else:
        r1=1
        r2=1
        for i in range(n-2):
            r=r1+r2
            r2=r1
            r1=r

        return r

