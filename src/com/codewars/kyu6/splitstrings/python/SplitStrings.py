def solution(s):
    result = []
    for i in range(0, len(s)-1, 2):
        result.append(s[i] + s[i+1])

    if len(s) % 2 == 1:
        result.append(s[-1]+'_')
    return result