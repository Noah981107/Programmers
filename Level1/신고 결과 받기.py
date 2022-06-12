def solution(id_list, report, k):
    
    report = set(report)
    
    answer = {x:0 for x in id_list}
    declaration = {x:0 for x in id_list}
    
    for value in report:
        _, b = map(str, value.split(' '))
        declaration[b] += 1
    
    for value in report:
        a, b = map(str, value.split(' '))
        if declaration[b] >= k:
            answer[a] += 1
            
    return list(answer.values())