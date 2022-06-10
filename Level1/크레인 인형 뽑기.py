def solution(board, moves):
    answer = 0
    box = []
    
    for move in moves:
        
        for i in range(len(board)):
            doll = board[i][move-1]

            if doll != 0:
                board[i][move-1] = 0
                
                if len(box) == 0:
                    box.append(doll)
                    break
                else:
                    if box[-1] != doll:
                        box.append(doll)
                        break
                    else:
                        box.pop()
                        answer += 1
                        break
                
    return answer * 2