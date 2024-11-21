#include <iostream>
#include <vector>
#include <string>
using namespace std;

int main() {
    int b, n, cb = 0;
    cin >> b >> n;

    vector<int> transactions;
    vector<int> snapshots = {b};

    for (int i = 0; i < n; i++) {
        string command;
        cin >> command;

        if (command == "read") {
            cout << snapshots[cb] << endl;
        } 
        else if (command == "credit" || command == "debit") {
            int amount;
            cin >> amount;
            if (command == "credit") {
                snapshots[cb] += amount;
            } else {
                snapshots[cb] -= amount;
            }
            transactions.push_back(command == "credit" ? amount : -amount);
        } 
        else if (command == "abort") {
            int index;
            cin >> index;
            // Explicitly cast size to int for comparison.
            if (index > 0 && index <= static_cast<int>(transactions.size())) {
                snapshots[cb] -= transactions[index - 1];
                transactions[index - 1] = 0;
            }
        } 
        else if (command == "rollback") {
            int snapshotIndex;
            cin >> snapshotIndex;
            // Explicitly cast size to int for comparison.
            if (snapshotIndex > 0 && snapshotIndex <= static_cast<int>(snapshots.size())) {
                cb = snapshotIndex - 1;
                snapshots.resize(cb + 1);
            }
        } 
        else if (command == "commit") {
            snapshots.push_back(snapshots[cb]);
            cb++;
        }
    }

    return 0;
}
