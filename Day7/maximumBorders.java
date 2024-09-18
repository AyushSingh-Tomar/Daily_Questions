// File: Solution.cpp
#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

// Function to find the maximum border of consecutive black cells
int getMaxBorder(int n, int m, const vector<string>& grid) {
    int maxBorder = 0;

    // Check maximum consecutive '#' in each row
    for (int i = 0; i < n; ++i) {
        int currentMax = 0;
        int count = 0;
        for (int j = 0; j < m; ++j) {
            if (grid[i][j] == '#') {
                count++;
                currentMax = max(currentMax, count);
            } else {
                count = 0;
            }
        }
        maxBorder = max(maxBorder, currentMax);
    }

    // Check maximum consecutive '#' in each column
    for (int j = 0; j < m; ++j) {
        int currentMax = 0;
        int count = 0;
        for (int i = 0; i < n; ++i) {
            if (grid[i][j] == '#') {
                count++;
                currentMax = max(currentMax, count);
            } else {
                count = 0;
            }
        }
        maxBorder = max(maxBorder, currentMax);
    }

    return maxBorder;
}

int main() {
    int t;
    cin >> t;

    while (t--) {
        int n, m;
        cin >> n >> m;
        vector<string> grid(n);

        // Input the grid
        for (int i = 0; i < n; ++i) {
            cin >> grid[i];
        }

        // Get the maximum border for the current grid
        int result = getMaxBorder(n, m, grid);
        cout << result << endl;
    }

    return 0;
}
