def solution(phone_number):
    answer = ''
    
    phone_number = list(map(str, phone_number))
    
    for i in range(len(phone_number)-4) :
        phone_number[i] = '*'
    
    answer = ''.join(phone_number)
    
    return answer