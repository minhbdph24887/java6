const app = angular.module("app", []);
app.controller("ctrl", function ($scope, $http) {
    let url = "http://localhost:8080/demo56/image/imagesDemo56"; // đó là đường dẫn trong hàm list bên controller
    $scope.url - function (filename) {
        return { url } + "/" + { filename }; // đó là đường đẫn trong hàm download bên controller
    }
    $scope.list = function () {
        $http.get(url).then(resp => {
            $scope.filenames = resp.data;
        }).catch(error => {
            console.log("Error", error);
        });
    };

    $scope.upload = function (files) { // đây là nơi xử lý hàm updload bên controller
        var form = new FormData();
        for (var i = 0; i < files.length; i++) {
            form.append("file", files[i]);
        }
        $http.post(url, form, {
            transformRequest: angular.identity,
            headers: { 'Content-Type': undefined }
        }).then(resp => {
            $scope.filenames.push(...resp.data);
        }).catch(error => {
            console.log("Error", error);
        });
    };

    $scope.delete = function () {
        $http.delete({ url } + "/" + { filename }).then(resp => { // đó là đường dẫn trong hàm delete bên controller
            let i = $scope.filenames.findIndex(name => name == filename);
            $scope.filenames.splice(i, 1);
        }).catch(error => {
            console.log("Error", error);
        });
    };
    //
    $scope.list();
});