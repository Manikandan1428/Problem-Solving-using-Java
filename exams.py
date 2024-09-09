def find_final_positions(grid, k):
    n = len(grid)
    positions = []
    for i in range(n):
        for j in range(n):
            x = (i + k) % n
            positions.append(grid[x][j])
    return positions

# Input
N, K = map(int, input().split())
grid = [input().strip() for _ in range(N)]

# Output
result = find_final_positions(grid, K)
for i in range(0, len(result), N):
    print("".join(result[i:i+N]))