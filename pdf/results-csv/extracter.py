import os
import os.path

ALGORITHMS_COUNT = 4

for resultf in sorted(os.listdir('.')):
    if not resultf.endswith('.csv'):
        continue
    with open(resultf) as csv:
        lines = csv.readlines()[1:]
    values = [[] for _ in range(ALGORITHMS_COUNT)]
    for i, line in enumerate(lines):
        vs = map(float, line.split(';')[1:])
        for j, v in enumerate(vs):
            values[j].append(v)

    print(resultf + ':')
    '''
    for algorithm in values[1:]:
        average = 0.0
        maximal = None
        for i, value in enumerate(algorithm):
            diff = float('inf') if value == 0 else values[0][i] * 100 / value - 100
            average += diff
            if maximal is None:
                maximal = diff
            elif resultf.find('size') != -1 or resultf.find('time') != -1:
                maximal = min(maximal, diff)
            else:
                maximal = max(maximal, diff)
        average /= len(algorithm)
        print('Average: %.3f%%, Maximal: %.3f%%' % (average, maximal))
    '''
    for algorithm in values:
        q8_result = None
        avg_result = 0.0
        for i, value in enumerate(algorithm):
            if i == 3:
                q8_result = value
            avg_result += value
        print('|Q|=8: %.3f, Average: %.3f' % (q8_result, avg_result / len(algorithm)))
    print()