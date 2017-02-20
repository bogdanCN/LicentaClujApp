/**
 * Created by Neamtu on 1/17/17.
 */
myApp.controller('LoginController', function($scope,$http,$location) {

    $scope.user;
    $scope.raspuns;

    $scope.login = function () {
        if ($scope.loginForm.$valid) {
            console.log("login valid");
            $http.post('http://localhost:8080/user/login', $scope.user)
                .success(function (response) {
                    console.log(response);
                    if(response == true) {
                        $location.path("/cladiri");
                    }
                });
        }
    }

});

