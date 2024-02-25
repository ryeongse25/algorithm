result = ['MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT', 'SUN']
day_per_month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

x, y = map(int, input().split())
total_day = y

if x > 1:
    total_day += sum(day_per_month[:x - 1])

print(result[(total_day % 7) - 1])