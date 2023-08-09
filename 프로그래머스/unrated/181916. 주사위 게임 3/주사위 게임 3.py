def solution(a, b, c, d):
    dict = {}
    dict[a] = dict.get(a, 0) + 1
    dict[b] = dict.get(b, 0) + 1
    dict[c] = dict.get(c, 0) + 1
    dict[d] = dict.get(d, 0) + 1
    arr = sorted(list(dict.items()), key = lambda x: x[1])
    
    if len(dict) == 1:
        return 1111 * arr[0][0]
    elif len(dict) == 4:
        return min(dict.keys())
    elif len(dict) == 3:
        return eval('*'.join([str(key) for key, value in arr if value == 1]))
    else:
        if 1 in dict.values():
            return (10 * arr[1][0] + arr[0][0]) ** 2
        else:
            return (arr[0][0] + arr[1][0]) * abs(arr[0][0] - arr[1][0])