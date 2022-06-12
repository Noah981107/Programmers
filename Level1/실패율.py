def solution(N, stages):
    answer = {}
    
    num_users = len(stages)
    for stage in range(1, N+1):
        if num_users != 0:
            cnt = stages.count(stage)
            answer[stage] = cnt / num_users
            num_users -= cnt
        else:
            answer[stage] = 0
        
    return sorted(answer, key=lambda x : answer[x], reverse=True)