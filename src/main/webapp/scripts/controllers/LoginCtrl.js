
angular.module('recruitApp.controller')

.controller('LoginCtrl', ['$scope', 'restClient', function($scope, restClient) {
	$scope.login = function() {
		
		restClient.post(RestfulAPI.LOGIN, {}, $scope.user).then(function(){
			window.location.href = "";
		});
	};
}]);