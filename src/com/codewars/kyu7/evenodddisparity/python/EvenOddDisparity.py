def solve(a):
    even = []
    odd = []
    for i in a:
        if type(i) == int and i % 2 == 0:
            even.append(i)
        elif type(i) == int and i % 2 != 0:
            odd.append(i)
    return len(even) - len(odd)