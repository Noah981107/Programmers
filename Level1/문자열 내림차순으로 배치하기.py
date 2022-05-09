def solution(s):
    answer = ''
    
    tmp = list(map(str, s))
    tmp.sort(reverse=True)
    answer = ''.join(tmp)
    
    return answer 