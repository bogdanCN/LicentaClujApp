/**
 * Created by Neamtu on 1/15/17.
 */
myApp.controller('BuildingController', function($scope, $http) {

    $scope.buildings = [];
    $scope.oneBuilding;
    $scope.newBuilding;
    $scope.myId;


    $scope.getAll = function() {
        $http.get('http://localhost:8080/building/all')
            .success(function (response) {
                $scope.buildings = response;
            });
    }

    $scope.getById = function() {
        $http.get('http://localhost:8080/building/getById/'+$scope.myId)
            .success(function (response) {
                $scope.oneBuilding = response;
            });
    }

    $scope.createBuilding = function() {

            console.log("inainte de post");

        $http.post('http://localhost:8080/building/create', $scope.newBuilding)
            .success(function (response) {
                $scope.building = response;
                $scope.getAll();
            });

        console.log("dupa post");
    }

    $scope.delete = function(){
        console.log("in delete");
    }



});