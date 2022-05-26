def solution(n, arr1, arr2):
    answer = []
    
    for i in range(n):
        tmp1 = format(arr1[i], 'b').zfill(n)
        tmp2 = format(arr2[i], 'b').zfill(n)
        txt = ''
        
        for j in range(n):
            if tmp1[j]=='1' or tmp2[j]=='1':
                txt += '#'
            elif tmp1[j]=='0' and tmp2[j]=='0':
                txt += ' '
                
        answer.append(txt)
    
    return answer