def solution(numbers, hand):
    answer = ''

    left_hand = '*' 
    right_hand = '#' 
    
    keypad = {1 : [0,0], 2 : [0,1], 3 : [0,2], 
              4 : [1,0], 5 : [1,1], 6 : [1,2], 
              7 : [2,0], 8 : [2,1], 9 : [2,2],
              '*':[3,0], 0 : [3,1], '#':[3,2]}
              
    for i in numbers:
        if i in [1,4,7]:   
            answer += 'L'
            left_hand = i
        elif i in [3,6,9]: 
            answer += 'R'
            right_hand = i
        else:			
            left_axis = keypad[left_hand]
            right_axis = keypad[right_hand]
			
            left_dist = abs(left_axis[0] - keypad[i][0]) + abs(left_axis[1] - keypad[i][1])
            right_dist = abs(right_axis[0] - keypad[i][0]) + abs(right_axis[1] - keypad[i][1])
            
            if left_dist < right_dist : 
                answer += 'L'
                left_hand = i
            elif left_dist > right_dist : 
                answer += 'R'
                right_hand = i
            else:					
                if hand == 'left':
                    answer += 'L'
                    left_hand = i
                else:
                    answer += 'R'
                    right_hand = i
    return answer