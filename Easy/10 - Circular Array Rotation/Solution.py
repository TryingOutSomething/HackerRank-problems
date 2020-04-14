def circularArrayRotation(a, k, queries):
    for i in range(k):
        a.insert(0, a[-1])
        a.pop(-1)

    value_to_return = [a[i] for i in queries]

    return value_to_return
