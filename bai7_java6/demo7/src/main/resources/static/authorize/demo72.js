var app = angular.module('app', []);
app.controller("ctrl", function ($scope, $http) {
    $http.get('http://localhost:8080/authority/getAll').then(resp => {
        $scope.db = resp.data;
        console.log(resp.data);
    })

    $scope.indexSelected = function (username, role) {
        return $scope.db.getAuthority
            .findIndex(a => a.account.username === username && a.role.id === role);
    }

    $scope.update = function (username, role) {
        var index = $scope.indexSelected(username, role);
        if (index >= 0) {
            var id = $scope.db.getAuthority[index].id;
            $http.delete('http://localhost:8080/authority/delete/${id}').then(resp => {
                $scope.db.getAuthority.splice(index, 1);
            });
        } else {
            var authority = {
                account: { username: username },
                role: { id: role }
            };
            $http.post('http://localhost:8080/authority/update', authority).then(resp => {
                $scope.db.getAuthority.push(resp.data);
            });
        }
    }
});
