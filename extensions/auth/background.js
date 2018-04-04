chrome.webRequest.onAuthRequired.addListener(function() {
		return {
			authCredentials: {
				username: "{username}",
				password: "{password}"
			}
		}
	}, 
	{urls: ["<all_urls>"]},
	["blocking"]
);