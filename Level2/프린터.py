from collections import deque

def solution(priorities, location):
    answer = 0
    
    que = deque([(value, idx) for idx, value in enumerate(priorities)])

    while len(que):
        item = que.popleft()
        if que and max(que)[0] > item[0]:
            que.append(item)
        else:
            answer += 1
            if item[1] == location:
                break
    return answer