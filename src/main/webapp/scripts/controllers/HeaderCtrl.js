
angular.module('recruitApp.controller')

.controller('HeaderCtrl', ['$scope', '$modal',
    function($scope, $modal) {
    	$scope.login = function() {
    		$modal.open({
    			templateUrl: 'views/login.html',
    			backdrop: false
    		});
    	};
}]);