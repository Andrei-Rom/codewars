def solve(n):
    nominals = [500, 200, 100,
               50, 20, 10]
    if int and n % 10 !=0:
        return -1
    countOfBanknotes = 0
    for nominal in nominals:
        countOfBanknotes +=  int and  n//nominal
        n %= nominal
    return countOfBanknotes
