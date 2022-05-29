import re

def count_smileys(arr):
    return len(re.findall('[:;][-~]?[)D]', str(arr)))