def solution(skill, skill_trees):
    answer = 0
    
    for skills in skill_trees :
        skillList = list(skill)
        
        for value in skills :
            if value in skill :
                if value != skillList.pop(0) :
                    break
        else :
            answer += 1
            
    return answer