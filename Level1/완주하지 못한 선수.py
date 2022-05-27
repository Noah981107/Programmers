def solution(participant, completion):
    
    participant.sort()
    completion.sort()
    
    for person, complete in zip(participant, completion):
        if person != complete:
            return person
    
    return participant.pop()