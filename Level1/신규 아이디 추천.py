def solution(new_id):
    answer = ''
    
    new_id = new_id.lower()
    
    for word in new_id:
        if word.isalnum() or word in '-_.':
            answer += word

    while '..' in answer:
        answer = answer.replace('..', '.')
    
    answer = answer.strip('.')
    
    if len(answer) == 0:
        answer += 'a'
    
    if len(answer) >= 16:    
        answer = answer[:15]
        answer = answer.rstrip('.')
    
    if len(answer) <= 2:
        while(len(answer) < 3):
            answer += answer[-1]
    
    return answer