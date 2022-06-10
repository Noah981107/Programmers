def solution(nums):
    answer = 0
    
    pick_list = []
    pick_num = len(nums) // 2
    
    for pocketmon in nums:
        if pick_num == answer:
            break
        
        if pocketmon not in pick_list:
            pick_list.append(pocketmon)
            answer += 1
    
    return answer