<!--
プログラム名:menu.jsp
プログラムの説明:メニュー画面を表示するプログラム
作成者:櫻井 康稀
作成日:2022/7/20
 -->

<%@ page contentType="text/html; charset=UTF-8"%>
<html>

<head>
<title>管理メニュー画面</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="<%= request.getContextPath() %>/css/style.css">
</head>

<body class="container-fuild">
	<div class="header-wrapper">
		<%@ include file="/common/header.jsp"%>
	</div>

	<div class="body-wrapper text-center container">
		<div class="card-list row">
			<div class="col-sm-3 mb-4">
				<div class="card">
					<a href="insert.html"> <img
						src="http://illustrain.com/img/work/2016/illustrain10-sakka-06.png"
						alt="商品登録" height="150" width="100%">
						<div class="card-body">
							<h5 class="card-title">商品登録</h5>
						</div>
					</a>
				</div>
			</div>
			<div class="col-sm-3 mb-4">
				<div class="card">
					<a href="list.html"> <img
						src="https://www.illust-box.jp/db_img/sozai/00011/110903/watermark.jpg"
						alt="ユニフォーム一覧" height="150" width="100%">
						<div class="card-body">
							<h5 class="card-title">一覧</h5>
						</div>
					</a>
				</div>
			</div>
			<div class="col-sm-3 mb-4">
				<div class="card">
					<a href="insertUser.html"> <img
						src="https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG0-wNvfK14_cc0t0Zx4f-nI6i71sVzAHbwmdy7LJV9eVV1d8RQRvUMmgy374Mp7H0uhOSE_Dq_LBcP8SMRbxul4XKhvHcxgag2DiDwCddlxeIIH4Xk91Wb0EF1JUqe16J4gbCegNCMfHXfDM4URTyuC9FhMZWYOhSF0mb3KkBwJwkAAksGKiLlvjd3mPc6J24Z5SjoC0IKgANtlNebsLxSoSyiEgCv0snmuf4LWsDjcs/kkrn_icon_user_2.png?errorImage=false"
						alt="ユーザ登録" height="150" width="100%">
						<div class="card-body">
							<h5 class="card-title">ユーザー登録</h5>
						</div>
					</a>
				</div>
			</div>
			<div class="col-sm-3 mb-4">
				<div class="card">
					<a href="listUser.html"> <img
						src="https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG1kFgzUBi2vigmURnXfA8ObhlKcr6bL83fHqUL_iyS_GXRiKu4DJgT_aKd9TFDRURafwJtqnmAclZwXE9mJxZQUX8AX3qh-9DSXgfibyHETgg2yuG7mNSq88XqMdvk2yXQS57kIupebaUn4ClHwNLIQISGFG1domNu1A3D5ZudQSoeV78UIubjFqGpPeblh-ZU3K3-HgLTqBYvsqLy_vPEo=/c7571a9645cb62517b77270e03d5e739_t.jpeg?errorImage=false"
						alt="ユーザ一覧" height="150" width="100%">
						<div class="card-body">
							<h5 class="card-title">ユーザ一覧</h5>
						</div>
					</a>
				</div>
			</div>
			<div class="col-sm-3 mb-4">
				<div class="card">
					<a href="showSaleByMonth.html"> <img
						src="https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG7s6XIz6WzUM9mMsixYxaAusUx8TA0uLAHGqfYpuwWicPPu9FJd-qR0DUQNwSNtpeDL4PwuheJ-OdTjHJGQ5X3S4XwgQ9WNFl-tS6g8Ho-831U_A8MkNd8NJieJROdCxNkCdasaqd6QZhV22jNskGnglj9jmrWYgAndbQdZaTMhzehACo-Jaa5xMXPSUoRaV55JFtXD15YXTic1FKwp6VGCkCzVck3sfu5HZT0yOh0rSsE7os_uJ3piagqBM3ujSl69vvgHJN9kQCToCNctiYT9HNeSQL6dZDMfSvkzC_rEejw4HsBnYgW-xVF5WhzDkQv8lPkEMhx3gPtS5mXYhlghDSY8tPzwPAzLfL0jIhSILkwJ0D-CG4KeP884C-PFFqujY4ACAA-cCgfcNrCSAXXVvUdc_NCY56UW4lQk79OzikhYDoT2LC7_7CZOKij1T2ybOBi9DD1pBLcDIbOkBJu3fKIWolGYb5X3jazwQ9aUKNA54WQc-VJKmV6DfNKnmrQ==/bar-chart-and-red-arrow-vector-id1314976273?errorImage=false"
						alt="売上状況" height="150" width="100%">
						<div class="card-body">
							<h5 class="card-title">売上状況</h5>
						</div>
					</a>
				</div>
			</div>
			<div class="col-sm-3 mb-4">
				<div class="card">
					<a href="showOrderedItem.html"> <img
						src="https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG1kFgzUBi2vigmURnXfA8OZu2TPe2bije0ESb3VVAq1GVec8YvKhxT30CASZvmDj_mi1mq6Uxa7uqSx-2q61KCwX8AX3qh-9DSXgfibyHETgg2yuG7mNSq88XqMdvk2yXQ0w-HmJ_HMuqs6LbkiaOxi9uDZKOV3pF-ZTjRyimwQMDKraqLOJP850HA0lvluBipspaIMJO6MOMBGtmFOEvqk=/8f780a84d203795f885139d3ccd30729_t.jpeg?errorImage=false"
						alt="購入状況確認" height="150" width="100%">
						<div class="card-body">
							<h5 class="card-title">購入状況</h5>
						</div>
					</a>
				</div>
			</div>
			<div class="col-sm-3 mb-5">
				<div class="card">
					<a href="login.html"> <img
						src="https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG1kFgzUBi2vigmURnXfA8OaWvDBf6amQT0k-8JjRRdFdworF2MQq4SEUXJIr6nZp_i840Mwi_xv6VN1aJpwnBZMX8AX3qh-9DSXgfibyHETgg2yuG7mNSq88XqMdvk2yXUJZmwElhHv8dsWNh8QzKvXOX91hfZKmVJYzPFlgma_JQJZaU_-JWAR6ggmCHvnIIZ-bVTk1aSdhjd4hM3FiBNA=/727a1d2c03191edfbf4c77e6ecb908b6_t.jpeg?errorImage=false"
						alt="ログアウト" height="150" width="100%">
						<div class="card-body">
							<h5 class="card-title">ログアウト</h5>
						</div>
					</a>
				</div>
			</div>
		</div>
	</div>

	<div class="footer-wrapper">
		<%@ include file="/common/footer.jsp"%>
	</div>
</body>

</html>