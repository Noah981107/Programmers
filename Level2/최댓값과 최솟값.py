def solution(s):
    li = []
    tmp = list(map(int, s.split(' ')))
    li.append(str(min(tmp)))
    li.append(str(max(tmp)))
    return ' '.join(li)