def solution(s):
    answer = ''
    numbers = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine']
    
    for number in numbers:
        if number in s:
            tmp = s.replace(number, str(numbers.index(number)))
            s = tmp
    
    return int(s)