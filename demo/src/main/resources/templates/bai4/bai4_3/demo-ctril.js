let host = "https://poly-java-6-7209b-default-rtdb.firebaseio.com";
const app = angular.module("app", []);
app.controller("ctrl", function ($scope, $http) {
    $scope.form = {}
    $scope.items = {}
    $scope.resert = function () {
        $scope.form = { gender: true, country: "VN" };
        $scope.key = null;
    }
    $scope.load_all = function () {
        var url = host + "/students.json"; // ${host} lấy đường dẫn ở dòng 1
        $http.get(url).then(resp => {
            $scope.items = resp.data;
            console.log("Sussess", resp)
        }).catch(error => {
            console.log("Error", error)
        });
    }
    $scope.edit = function (key) {
        var url = host + "/students/" + key + ".json";
        $http.get(url).then(resp => {
            $scope.form = resp.data;
            $scope.key = key;
            console.log("Sussess", resp)
        }).catch(error => {
            console.log("Error", error)
        });
    }
    $scope.create = function () {
        var item = angular.copy($scope.form);
        var url = host + "/students.json";
        $http.post(url, item).then(resp => {
            $scope.key = resp.data.name;
            $scope.items[$scope.key] = item;
            $scope.resert();
            console.log("Success", resp);
        }).catch(error => {
            console.log("Error", error)
        });
    }
    $scope.update = function () {
        var item = angular.copy($scope.form);
        var url = host + "/students/" + $scope.key + ".json";
        $http.put(url, item).then(resp => {
            $scope.items[$scope.key] = resp.data;
            console.log("Sussess", resp)
        }).catch(error => {
            console.log("Error", error)
        });
    }
    $scope.delete = function (key) {
        var url = host + "/students/" + key + ".json";
        $http.delete(url).then(resp => {
            delete $scope.items[key];
            $scope.resert();
            console.log("Sussess", resp)
        }).catch(error => {
            console.log("Error", error)
        });
    }
    // thực hiện tải toàn bộ students
    $scope.load_all();
    $scope.resert();
});