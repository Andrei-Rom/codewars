def smaller(arr):
    result = []
    for i in range(len(arr)) :
        result.append(0)
        for j in range(i + 1, len(arr)):
            if(arr[i] > arr[j]):
                result[i] += 1

    return result