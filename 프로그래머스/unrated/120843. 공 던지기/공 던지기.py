def solution(numbers, k):
    # 짝수 명일 때
    if len(numbers) % 2 == 0:
        even_numbers = [numbers[i] for i in range(0, len(numbers), 2)]
        return even_numbers[k % len(even_numbers) - 1]
    # 홀수 명일 때
    else:
        odd_numbers = []
        for i in range(2):
            for j in range(i, len(numbers), 2):
                odd_numbers.append(numbers[j])
        return odd_numbers[k % len(odd_numbers) - 1]
        
        