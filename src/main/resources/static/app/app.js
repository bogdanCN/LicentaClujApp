/**
 * Created by Neamtu on 1/15/17.
 */
var myApp = angular.module('myApp', ['ngRoute'])
                    .config(config);


config.$inject = ['$routeProvider'];

    function config($routeProvider) {
    $routeProvider
        .when('/cladiri', {
            controller:'BuildingController',
            templateUrl:'/templates/buildings.html'
        })

        .when('/login', {
            controller:'LoginController',
            templateUrl:'/templates/login.html'
        })

        .otherwise({
            redirectTo: '/templates/login.html'
        });
};


