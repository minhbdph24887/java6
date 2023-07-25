let host = "http://localhost:8080/student5_1";
const app = angular.module('app', []);
app.controller('ctrl', function ($scope, $http) {
    $scope.form = {};
    $scope.item = [];
    $scope.resert = function () {
        $scope.form = { gender: true, country: "VN" };
        $scope.items = null;
    };
    $scope.loadData = function () {
        var url = host + "/hien-thi";
        $http.get(url).then(resp => {
            $scope.items = resp.data;
            console.log("Success", resp)
        }).catch(error => {
            console.log("Error", error)
        });
    };
    $scope.edit = function (email) {
        var url = host + "/detail/" + email;
        $http.get(url).then(resp => {
            $scope.form = resp.data;
            console.log("Success", resp)
        }).catch(error => {
            console.log("Error", error)
        });
    };
    $scope.create = function () {
        var item = angular.copy($scope.form);
        var url = host + "/add";
        $http.post(url, item).then(resp => {
            $scope.items.push(item);
            $scope.resert();
            $scope.loadData();
            console.log("Success", resp)
        }).catch(error => {
            console.log("Error", error)
        });
    };
    $scope.update = function () {
        var item = angular.copy($scope.form);
        var url = host + "/update/" + $scope.form.email;
        $http.put(url, item).then(resp => {
            var index = $scope.items.findIndex(item => item.email == $scope.form.email);
            $scope.items[index] = resp.data;
            console.log("Success", resp)
        }).catch(error => {
            console.log("Error", error)
        });
    };
    $scope.delete = function (email) {
        var url = host + "/delete/" + email;
        $http.delete(url).then(resp => {
            var index = $scope.items.findIndex(item => item.email == email);
            $scope.items.splice(index, 1);
            $scope.resert();
            $scope.loadData();
            console.log("Success", resp)
        }).catch(error => {
            console.log("Error", error)
        });
    };
    // Thực hiện tải toàn bộ students
    $scope.loadData();
    $scope.resert();
});