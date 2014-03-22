angular.module('recruitApp.controller').controller('JobDetailCtrl', [ '$scope', 'restClient', function($scope, restClient) {
    $scope.getJobDetail = function() {
        restClient.post(RestfulAPI.JOB_DETAIL, {jobRecruitID : 1}).then(function() {
        	$scope.jobRecruit = restClient.getResponse();
        });
    };
    
    $scope.init = function() {
    	$scope.getJobDetail();
    };
} ]);