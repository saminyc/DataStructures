
import math
import os
import random
import re
import sys



# The function is expected to return an INTEGER.
# The function accepts 2D_INTEGER_ARRAY arr as parameter.


def diagonalDifference(arr):
    diff_in_sums=0
    l_diagonal_sum=0#Stores the sum of elements of left diagonal
    r_diagonal_sum=0#Stores the sum of elements of right diagonal
    for idx in range(len(arr)):
        l_diagonal_sum+=arr[idx][idx]
        r_diagonal_sum+=arr[idx][len(arr)-idx-1]
    diff_in_sums=abs(l_diagonal_sum-r_diagonal_sum)#Calculates the absolute value of the difference 
    
    return diff_in_sums #Returns the diff_in_sums
    
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    arr = []

    for _ in range(n):
        arr.append(list(map(int, input().rstrip().split())))

    result = diagonalDifference(arr)

    fptr.write(str(result) + '\n')

    fptr.close()
