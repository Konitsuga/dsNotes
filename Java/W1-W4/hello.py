def fun1(x):
    y = x + 1
    print(x)
    def fun2(z):
        z = ((x + y) * (x - y)) * z
        print(z)
    fun2(2)
fun1(5)

i = 42
def f():
    j = i + 10
    print(j)
print(i)
f()
