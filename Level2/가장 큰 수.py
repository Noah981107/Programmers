def solution(numbers):
    answer = ''
    
    li = list(map(str, numbers))
    li.sort(key=lambda value: value*3, reverse=True)
    
    for ele in li:
        answer += str(ele)
    return answer